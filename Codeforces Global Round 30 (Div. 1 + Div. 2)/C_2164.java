import java.util.*;

public class C_2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        while (testCases-- > 0) {
            handleCase(sc);
        }
    }

    static class Offer {
        long requirement, reward;
        Offer(long requirement, long reward) {
            this.requirement = requirement;
            this.reward = reward;
        }
    }

    private static void handleCase(Scanner sc) {
        int numSwords = sc.nextInt();
        int numOffers = sc.nextInt();

        long[] swordPowers = readLongArray(sc, numSwords);
        long[] minPowers = readLongArray(sc, numOffers);
        long[] rewards = readLongArray(sc, numOffers);

        List<Offer> upgradeOffers = new ArrayList<>();
        List<Offer> simpleOffers = new ArrayList<>();

        categorizeOffers(minPowers, rewards, upgradeOffers, simpleOffers);

        TreeMap<Long, Integer> inventory = buildInventory(swordPowers);

        int totalMatches = useUpgradeOffers(inventory, upgradeOffers);
        totalMatches += useSimpleOffers(inventory, simpleOffers);

        System.out.println(totalMatches);
    }

    private static long[] readLongArray(Scanner sc, int size) {
        long[] arr = new long[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextLong();
        }
        return arr;
    }

    private static void categorizeOffers(long[] b, long[] c,
                                         List<Offer> upgrade,
                                         List<Offer> normal) {
        for (int i = 0; i < b.length; i++) {
            if (c[i] > 0) {
                upgrade.add(new Offer(b[i], c[i]));
            } else {
                normal.add(new Offer(b[i], c[i]));
            }
        }
    }

    private static TreeMap<Long, Integer> buildInventory(long[] swords) {
        TreeMap<Long, Integer> map = new TreeMap<>();
        for (long sword : swords) {
            map.put(sword, map.getOrDefault(sword, 0) + 1);
        }
        return map;
    }

    private static int useUpgradeOffers(TreeMap<Long, Integer> inventory, List<Offer> offers) {
        offers.sort(Comparator.comparingLong(o -> o.requirement));
        int count = 0;

        for (Offer offer : offers) {
            Long currentSword = inventory.ceilingKey(offer.requirement);
            if (currentSword != null) {
                updateInventory(inventory, currentSword, -1);
                long upgradedSword = Math.max(currentSword, offer.reward);
                updateInventory(inventory, upgradedSword, 1);
                count++;
            }
        }
        return count;
    }

    private static int useSimpleOffers(TreeMap<Long, Integer> inventory, List<Offer> offers) {
        List<Long> swords = flattenInventory(inventory);
        Collections.sort(swords);
        offers.sort(Comparator.comparingLong(o -> o.requirement));

        int i = 0, j = 0, matches = 0;
        while (i < swords.size() && j < offers.size()) {
            if (swords.get(i) >= offers.get(j).requirement) {
                matches++;
                j++;
            }
            i++;
        }
        return matches;
    }

    private static List<Long> flattenInventory(TreeMap<Long, Integer> inventory) {
        List<Long> allSwords = new ArrayList<>();
        for (Map.Entry<Long, Integer> entry : inventory.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                allSwords.add(entry.getKey());
            }
        }
        return allSwords;
    }

    private static void updateInventory(Map<Long, Integer> map, long value, int delta) {
        map.put(value, map.getOrDefault(value, 0) + delta);
        if (map.get(value) <= 0) {
            map.remove(value);
        }
    }
}
