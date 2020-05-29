package requests;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Date;

public class Base {

    @JsonProperty
    private Trains data;

    @JsonProperty("access_token")
    private String accessToken;


    @JsonProperty("datetime_utc")
    private Date datetimeUtc;


    @JsonProperty("lang")
    private String lang;

    @JsonProperty("request_id")
    private String requestId;


    @JsonProperty("tran_id")
    private String tranId;


    @JsonProperty("version")
    private Enum version;


    @JsonProperty("os")
    private int os;

    /**
     * No args constructor for use in serialization
     *
     */
    public Base() {
    }

    /**
     *
     * @param os
     * @param datetimeUtc
     * @param accessToken
     * @param requestId
     * @param data
     * @param tranId
     * @param lang
     * @param version
     */
    public Base(Trains data, String accessToken, Date datetimeUtc, String lang, String requestId, String tranId, Enum version, Integer os) {
        super();
        this.data = data;
        this.accessToken = accessToken;
        this.datetimeUtc = datetimeUtc;
        this.lang = lang;
        this.requestId = requestId;
        this.tranId = tranId;
        this.version = version;
        this.os = os;
    }

    public Trains getData() {
        return data;
    }

    public void setData(Trains data) {
        this.data = data;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Date getDatetimeUtc() {
        return datetimeUtc;
    }

    public void setDatetimeUtc(Date datetimeUtc) {
        this.datetimeUtc = datetimeUtc;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getTranId() {
        return tranId;
    }

    public void setTranId(String tranId) {
        this.tranId = tranId;
    }

    public Enum getVersion() {
        return version;
    }

    public void setVersion(Enum version) {
        this.version = version;
    }

    public int getOs() {
        return os;
    }

    public void setOs(int os) {
        this.os = os;
    }

}
