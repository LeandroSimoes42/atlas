package br.com.atlas.atlas.service.enumeration;

public enum ErrorConstants {
    GENERAL {
        @Override
        public String getValue() {
            return "error.general";
        }

        @Override
        public String getMessage() {
            return "general error";
        }
    },
    NOT_FOUND {
        @Override
        public String getValue() {
            return "error.not_found";
        }

        @Override
        public String getMessage() {
            return "NOT_FOUND";
        }
    },
    ACCESS_DENIED {
        @Override
        public String getValue() {
            return "error.accessDenied";
        }

        @Override
        public String getMessage() {
            return "You don't have access to this resource";
        }
    },
    REGION_EXIST {
        @Override
        public String getValue() {
            return "error.regionExist";
        }

        @Override
        public String getMessage() {
            return "Region already exist";
        }
    },
    ;

    public abstract String getValue();

    public abstract String getMessage();
}
