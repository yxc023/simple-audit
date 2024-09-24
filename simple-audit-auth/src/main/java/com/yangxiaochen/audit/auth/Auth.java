package com.yangxiaochen.audit.auth;

public class Auth {

        private AccessKeyStore accessKeyStore;
        private AccessKeyGenerator accessKeyGenerator;

        public Auth(AccessKeyStore accessKeyStore, AccessKeyGenerator accessKeyGenerator) {
            this.accessKeyStore = accessKeyStore;
            this.accessKeyGenerator = accessKeyGenerator;
        }

        public String registerAccessKey(String accessKey, AccessInfo accessInfo) {
            return accessKeyStore.saveAccessKey(accessKeyGenerator.generateAccessKey(), accessInfo);
        }

        public AccessInfo getAccessInfo(String accessKey) {
            return accessKeyStore.getAccessInfo(accessKey);
        }
}
