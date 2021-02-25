package week12d02;

import java.util.*;

public class Street {

    private List<Site> sites = new ArrayList<>();

    public void sellSite(Site site) {
        sites.add(site);
    }

    public int calculateTheAddressNumberOfTheLastSoldSite() {
        emptyListErrorHandling();
        int actualEvenSideAddress = 0;
        int actualOddSideAddress = -1;
        for (Site e: sites) {
            if (e.getAddressParity() == 0) {
                actualEvenSideAddress = actualEvenSideAddress + 2;
            } else {
                actualOddSideAddress = actualOddSideAddress + 2;
            }
        }
        return calculateTheLastSoldSiteParity(actualEvenSideAddress, actualOddSideAddress);
    }

    private void emptyListErrorHandling() {
        if (sites.isEmpty()) {
            throw new IllegalArgumentException("This method cannot be execute with empty list!");
        }
    }

    private int calculateTheLastSoldSiteParity(int actualEvenSideAddress, int actualOddSideAddress) {
        if (sites.get(sites.size()-1).getAddressParity() == 0) {
            return actualEvenSideAddress;
        }
        return actualOddSideAddress;
    }

    public Map<FenceCondition, Integer> makeFenceConditionStatistic() {
        Map<FenceCondition, Integer> fenceRegister = fillMapKeysWithEnum();
        for (Site e: sites) {
            fenceRegister.put(e.getFenceCondition(),fenceRegister.get(e.getFenceCondition())+1);
        }
        return fenceRegister;
    }

    private Map<FenceCondition, Integer> fillMapKeysWithEnum() {
        Map<FenceCondition, Integer> fenceRegister = new LinkedHashMap<>();
        for (FenceCondition e: FenceCondition.values()) {
            fenceRegister.put(e, 0);
        }
        return fenceRegister;
    }

    public List<Site> getSites() {
        return sites;
    }

}