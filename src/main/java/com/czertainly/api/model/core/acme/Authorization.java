package com.czertainly.api.model.core.acme;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

/**
 * Parameters and fields for the Authorization Object
 * in the ACME protocol
 */
public class Authorization {
    /**
     * Identifier that the Account is authorized to represent
     */
    @Schema(
            description = "ACME Identifier",
            required = true
    )
    private Identifier identifier;

    /**
     * Status of the Authorization Object. Possible values are "pending", "valid", "invalid", "deactivated",
     * "expired" and "revoked"
     */
    @Schema(
            description = "ACME Authorization status",
            required = true
    )
    private AuthorizationStatus status;

    /**
     * Timestamp after which the server will consider the Authorization as Invalid.
     * The value is encoded in the format defined by RFC3339
     *
     * This field is required if the object is "valid" by status
     */
    @Schema(
            description = "Expiry of Authorization",
            required = false
    )
    private String expires;

    /**
     *List of the Authorization objects that the client is entitles to complete to prove the ownership
     * of the domain.
     */
    @Schema(
            description = "List of Challenges for the client to complete",
            required = false
    )
    private List<Challenge> challenges;

    /**
     * True if the certificate is wildcard
     */
    private Boolean wildcard;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public AuthorizationStatus getStatus() {
        return status;
    }

    public void setStatus(AuthorizationStatus status) {
        this.status = status;
    }

    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }

    public List<Challenge> getChallenges() {
        return challenges;
    }

    public void setChallenges(List<Challenge> challenges) {
        this.challenges = challenges;
    }

    public Boolean getWildcard() {
        return wildcard;
    }

    public void setWildcard(Boolean wildcard) {
        this.wildcard = wildcard;
    }
}