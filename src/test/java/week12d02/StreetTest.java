package week12d02;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

class StreetTest {

        Street access = new Street();

    @Test
    public void testSellSite() {
        access.sellSite(new Site(0, 10, FenceCondition.PERFECT));
        access.sellSite(new Site(0, 7, FenceCondition.NEED_UPGRADE));
        access.sellSite(new Site(1, 12, FenceCondition.NEED_UPGRADE));
        access.sellSite(new Site(0, 9, FenceCondition.PERFECT));
        access.sellSite(new Site(0, 11, FenceCondition.NO_FENCE));
        access.sellSite(new Site(1, 13, FenceCondition.PERFECT));

        assertEquals(6, access.getSites().size());
    }

    @Test
    public void testCalculateAddressNumber() {
        access.sellSite(new Site(0, 10, FenceCondition.PERFECT));
        access.sellSite(new Site(0, 7, FenceCondition.NEED_UPGRADE));
        access.sellSite(new Site(1, 12, FenceCondition.NEED_UPGRADE));
        access.sellSite(new Site(0, 9, FenceCondition.PERFECT));
        access.sellSite(new Site(0, 11, FenceCondition.NO_FENCE));
        access.sellSite(new Site(1, 13, FenceCondition.PERFECT));

        assertEquals(3, access.calculateTheAddressNumberOfTheLastSoldSite());
    }

    @Test
    public void testFenceConditionStatistic() {
        access.sellSite(new Site(0, 10, FenceCondition.PERFECT));
        access.sellSite(new Site(0, 7, FenceCondition.NEED_UPGRADE));
        access.sellSite(new Site(1, 12, FenceCondition.NEED_UPGRADE));
        access.sellSite(new Site(0, 9, FenceCondition.PERFECT));
        access.sellSite(new Site(0, 11, FenceCondition.NO_FENCE));
        access.sellSite(new Site(1, 13, FenceCondition.PERFECT));

        Integer expectedNumber = 3;
        Map<FenceCondition, Integer> expectedResult = new HashMap<>(Map.of(FenceCondition.PERFECT, 3));

        assertEquals(expectedNumber, access.makeFenceConditionStatistic().get(FenceCondition.PERFECT));
    }

}