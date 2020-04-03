package com.kotlin.simple.simple2;

public class InteropMethed {

    public static class User{

        private String userName;
        private long userId;
        private boolean isVip;

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public long getUserId() {
            return userId;
        }

        public void setUserId(long userId) {
            this.userId = userId;
        }

        public boolean isVip() {
            return isVip;
        }

        public void setVip(boolean vip) {
            isVip = vip;
        }
    }


    public void removeIndices(int[] indices) {


    }

    public void removeIndicesVarArg(int... indices) {

    }






}


