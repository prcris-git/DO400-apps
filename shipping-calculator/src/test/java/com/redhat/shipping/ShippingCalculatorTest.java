package com.redhat.shipping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShippingCalculatorTest {
   @Test
   public void canCalculateTheCostForARegion() {
       ShippingCalculator calculator = new ShippingCalculator();
       assertEquals(0, calculator.costForRegion("A Region"));
   }
   @Test
   public void onNARegionTheCostIs100() {
       assertEquals(100, (new ShippingCalculator()).costForRegion("NA"));

   }
}
