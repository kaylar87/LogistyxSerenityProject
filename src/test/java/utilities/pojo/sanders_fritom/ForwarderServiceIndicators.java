package utilities.pojo.sanders_fritom;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ShippingId",
        "ShipperCode",
        "TrackAndTrace",
        "DirectDeliveryOnly",
        "DeliverySignature",
        "HoldAtLocation",
        "NumberOfAttempts",
        "Shipment",
        "InterventionalMonitoring",
        "AdditionalServices"
})
@Getter
@Setter
public class ForwarderServiceIndicators {

    @JsonProperty("ShippingId")
    public Integer shippingId;
    @JsonProperty("ShipperCode")
    public String shipperCode;
    @JsonProperty("TrackAndTrace")
    public Object trackAndTrace;
    @JsonProperty("DirectDeliveryOnly")
    public Object directDeliveryOnly;
    @JsonProperty("DeliverySignature")
    public String deliverySignature;
    @JsonProperty("HoldAtLocation")
    public Object holdAtLocation;
    @JsonProperty("NumberOfAttempts")
    public Object numberOfAttempts;
    @JsonProperty("Shipment")
    public Object shipment;
    @JsonProperty("InterventionalMonitoring")
    public Object interventionalMonitoring;
    @JsonProperty("AdditionalServices")
    public List<String> additionalServices = null;

}