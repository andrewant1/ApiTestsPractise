package utilities;


public enum Version {
    Ver8("1.008"),
    Ver10("1.010"),
    Ver11("1.011");

private String version;

    private Version( String version){
        this.version=version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}

