package com.yangxiaochen.audit.auth;

public class Auth {

        private AccessKeyStore accessKeyStore;
        private AccessKeyGenerator accessKeyGenerator;

        public Auth(AccessKeyStore accessKeyStore, AccessKeyGenerator accessKeyGenerator) {
            this.accessKeyStore = accessKeyStore;
            this.accessKeyGenerator = accessKeyGenerator;
        }

        public String generateAccessKey() {
            return accessKeyGenerator.generateAccessKey();
        }

        public String saveAccessKey(String accessKey, AccessInfo accessInfo) {
            return accessKeyStore.saveAccessKey(accessKey, accessInfo);
        }

        public AccessInfo getAccessInfo(String accessKey) {
            return accessKeyStore.getAccessInfo(accessKey);
        }
}
