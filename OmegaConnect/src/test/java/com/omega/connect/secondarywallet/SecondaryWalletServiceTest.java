package com.omega.connect.secondarywallet;

import omega.connect.secondarywallet.SecondaryWalletService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.springframework.test.util.AssertionErrors.assertTrue;

/**
 * Created by waimingmak on 2017-04-22.
 */

public class SecondaryWalletServiceTest {


    private SecondaryWalletService secondaryWalletService;

    @Before
    public void setUp() {
        secondaryWalletService = new SecondaryWalletService();
    }


    @Test
    public void testInjection() throws Exception {
        assertNotNull(secondaryWalletService);
    }

    @Test
    public void test_pingSuccess() throws Exception {

        secondaryWalletService.ping();
        //No exception that is ok
        assertTrue("",true);

    }

}
