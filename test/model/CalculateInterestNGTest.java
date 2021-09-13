/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author dungk
 */
public class CalculateInterestNGTest {
    
    public CalculateInterestNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Case 1:
     * - loanTerm = -1
     * - loanAmount = 800.0;
     * - customerPoint = 10000;
     * - standardInterestRate = 1.0F;
     */
    @Test
    public void testCalculate() {
        System.out.println("calculate");
        double loanTerm = -1;
        double loanAmount = 800.0;
        int customerPoint = 10000;
        float standardInterestRate = 1.0F;
        CalculateInterest instance = new CalculateInterest();
        double expResult = 1.44;
        double result = instance.calculate(loanTerm, loanAmount, customerPoint, standardInterestRate);
        System.out.println("calculate : Result = "+result );
        assertEquals(result, expResult,1.0);
        
    }
   /**
     * Case 2:
     * - loanTerm = 0
     * - loanAmount = 500.0;
     * - customerPoint = 5000;
     * - standardInterestRate = 1.0F;
     */
    @Test
    public void test() {
        System.out.println("calculate");
        double loanTerm = 0;
        double loanAmount = 500.0;
        int customerPoint = 5000;
        float standardInterestRate = 1.0F;
        CalculateInterest instance = new CalculateInterest();
        double expResult = 1.2;
        double result = instance.calculate(loanTerm, loanAmount, customerPoint, standardInterestRate);
        System.out.println("calculate : Result = "+result );
        assertEquals(result, expResult,0.0);
        
    }
   
    
    
}
