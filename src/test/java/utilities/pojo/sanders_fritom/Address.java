package utilities.pojo.sanders_fritom;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "SourceLevel",
        "AddressId",
        "ShippingId",
        "ShipperCode",
        "Reference",
        "AddressLines",
        "PostalCode",
        "LocalityCode",
        "LocalityName",
        "SubdivisionCode",
        "SubdivisionName",
        "CountryCode",
        "CountryName",
        "Description",
        "Remark",
        "Contacts",
        "VatNumber",
        "BankAccountNumber",
        "Residential",
        "ForwarderDivisionAccounts",
        "AddressTypes",
        "AccountNumber",
        "ProjectCode"
})
@Getter
@Setter
public class Address {

    @JsonProperty("SourceLevel")
    public String sourceLevel;
    @JsonProperty("AddressId")
    public Integer addressId;
    @JsonProperty("ShippingId")
    public Integer shippingId;
    @JsonProperty("ShipperCode")
    public String shipperCode;
    @JsonProperty("Reference")
    public String reference;
    @JsonProperty("AddressLines")
    public List<AddressLine> addressLines = null;
    @JsonProperty("PostalCode")
    public String postalCode;
    @JsonProperty("LocalityCode")
    public Object localityCode;
    @JsonProperty("LocalityName")
    public String localityName;
    @JsonProperty("SubdivisionCode")
    public Object subdivisionCode;
    @JsonProperty("SubdivisionName")
    public Object subdivisionName;
    @JsonProperty("CountryCode")
    public String countryCode;
    @JsonProperty("CountryName")
    public Object countryName;
    @JsonProperty("Description")
    public Object description;
    @JsonProperty("Remark")
    public String remark;
    @JsonProperty("Contacts")
    public List<Contact> contacts = null;
    @JsonProperty("VatNumber")
    public String vatNumber;
    @JsonProperty("BankAccountNumber")
    public Object bankAccountNumber;
    @JsonProperty("Residential")
    public Boolean residential;
    @JsonProperty("ForwarderDivisionAccounts")
    public List<Object> forwarderDivisionAccounts = null;
    @JsonProperty("AddressTypes")
    public List<AddressType> addressTypes = null;
    @JsonProperty("AccountNumber")
    public Object accountNumber;
    @JsonProperty("ProjectCode")
    public Object projectCode;

}