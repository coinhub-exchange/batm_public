package com.generalbytes.batm.server.extensions.extra.lightningbitcoin.wallets.eclair;

import com.generalbytes.batm.common.currencies.CryptoCurrency;
import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;

public class EclairWalletTest {

    private EclairWallet w = new EclairWallet("http", "localhost", 8090, "6atfe28d");

    @Ignore
    @Test
    public void sendCoins() {
        String paymentHash = w.sendCoins("lnbc1pws08zjpp5cnjgqj4qapr98uawh58wx6mc6s7vvtrg3ev7ezj4n7xpkztrhlzsdqu2askcmr9wssx7e3q2dshgmmndp5scqzysxqrrssug40fe2sj24n848p69w8093y0j5fl809qvxhjultkudcnnn3x8r8u3l5xq0ulllxdcthvzp5p2x3f3zrzfs23gmvvxkauewx2vqqnjcp629yl5",
            new BigDecimal("0.00000001"), CryptoCurrency.LBTC.getCode(), "");
        System.out.println(paymentHash);
    }

    @Ignore
    @Test
    public void getCryptoAddress() {
    }

    @Ignore
    @Test
    public void getCryptoBalance() {
        BigDecimal cryptoBalance = w.getCryptoBalance(CryptoCurrency.LBTC.getCode());
        System.out.println(cryptoBalance);
    }
}