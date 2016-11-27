package id.alfianh.latihan.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alfianh on 27/11/16.
 */

public class LoginResponse {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("join_at")
    @Expose
    private int joinAt;
    @SerializedName("profile_picture")
    @Expose
    private Object profilePicture;
    @SerializedName("referral_link")
    @Expose
    private String referralLink;
    @SerializedName("registered_via")
    @Expose
    private RegisteredVia registeredVia;
    @SerializedName("is_guest")
    @Expose
    private boolean isGuest;
    @SerializedName("token")
    @Expose
    private Token token;
    @SerializedName("axis")
    @Expose
    private Axis axis;

    @SerializedName("code")
    @Expose
    private int code;
    @SerializedName("message")
    @Expose
    private String message;

    /**
     * @return The code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code The code
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return The message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message The message
     */
    public void setMessage(String message) {
        this.message = message;
    }


    /**
     * @return The id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return The joinAt
     */
    public int getJoinAt() {
        return joinAt;
    }

    /**
     * @param joinAt The join_at
     */
    public void setJoinAt(int joinAt) {
        this.joinAt = joinAt;
    }

    /**
     * @return The profilePicture
     */
    public Object getProfilePicture() {
        return profilePicture;
    }

    /**
     * @param profilePicture The profile_picture
     */
    public void setProfilePicture(Object profilePicture) {
        this.profilePicture = profilePicture;
    }

    /**
     * @return The referralLink
     */
    public String getReferralLink() {
        return referralLink;
    }

    /**
     * @param referralLink The referral_link
     */
    public void setReferralLink(String referralLink) {
        this.referralLink = referralLink;
    }

    /**
     * @return The registeredVia
     */
    public RegisteredVia getRegisteredVia() {
        return registeredVia;
    }

    /**
     * @param registeredVia The registered_via
     */
    public void setRegisteredVia(RegisteredVia registeredVia) {
        this.registeredVia = registeredVia;
    }

    /**
     * @return The isGuest
     */
    public boolean isIsGuest() {
        return isGuest;
    }

    /**
     * @param isGuest The is_guest
     */
    public void setIsGuest(boolean isGuest) {
        this.isGuest = isGuest;
    }

    /**
     * @return The token
     */
    public Token getToken() {
        return token;
    }

    /**
     * @param token The token
     */
    public void setToken(Token token) {
        this.token = token;
    }

    /**
     * @return The axis
     */
    public Axis getAxis() {
        return axis;
    }

    /**
     * @param axis The axis
     */
    public void setAxis(Axis axis) {
        this.axis = axis;
    }

    public class RegisteredVia {

        @SerializedName("provider")
        @Expose
        private String provider;
        @SerializedName("id")
        @Expose
        private String id;

        /**
         * @return The provider
         */
        public String getProvider() {
            return provider;
        }

        /**
         * @param provider The provider
         */
        public void setProvider(String provider) {
            this.provider = provider;
        }

        /**
         * @return The id
         */
        public String getId() {
            return id;
        }

        /**
         * @param id The id
         */
        public void setId(String id) {
            this.id = id;
        }

    }

    public class Token {

        @SerializedName("access_token")
        @Expose
        private String accessToken;
        @SerializedName("token_type")
        @Expose
        private String tokenType;
        @SerializedName("expires_in")
        @Expose
        private int expiresIn;

        /**
         * @return The accessToken
         */
        public String getAccessToken() {
            return accessToken;
        }

        /**
         * @param accessToken The access_token
         */
        public void setAccessToken(String accessToken) {
            this.accessToken = accessToken;
        }

        /**
         * @return The tokenType
         */
        public String getTokenType() {
            return tokenType;
        }

        /**
         * @param tokenType The token_type
         */
        public void setTokenType(String tokenType) {
            this.tokenType = tokenType;
        }

        /**
         * @return The expiresIn
         */
        public int getExpiresIn() {
            return expiresIn;
        }

        /**
         * @param expiresIn The expires_in
         */
        public void setExpiresIn(int expiresIn) {
            this.expiresIn = expiresIn;
        }

    }

    public class Axis {

        @SerializedName("data")
        @Expose
        private List<Object> data = new ArrayList<Object>();

        /**
         * @return The data
         */
        public List<Object> getData() {
            return data;
        }

        /**
         * @param data The data
         */
        public void setData(List<Object> data) {
            this.data = data;
        }

    }


}
