package com.example.hsa4;

public class BitcoinWrapper {
    private UsdWrapper bitcoin;

    public BitcoinWrapper() {
    }

    public UsdWrapper getBitcoin() {
        return bitcoin;
    }

    public void setBitcoin(UsdWrapper bitcoin) {
        this.bitcoin = bitcoin;

    }

    public static class UsdWrapper {
        Integer usd;

        public UsdWrapper() {
        }

        public int getUsd() {
            return usd;
        }

        public void setUsd(int usd) {
            this.usd = usd;
        }
    }

}
