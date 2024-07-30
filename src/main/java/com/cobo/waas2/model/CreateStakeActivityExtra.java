/*
 * Cobo Wallet as a Service 2.0
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@cobo.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cobo.waas2.model;

import java.util.Objects;
import com.cobo.waas2.model.BabylonStakeExtra;
import com.cobo.waas2.model.EigenLayerLstStakeExtra;
import com.cobo.waas2.model.EigenLayerNativeStakeExtra;
import com.cobo.waas2.model.StakingPoolType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import com.cobo.waas2.JSON;

@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class CreateStakeActivityExtra extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateStakeActivityExtra.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateStakeActivityExtra.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateStakeActivityExtra' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<BabylonStakeExtra> adapterBabylonStakeExtra = gson.getDelegateAdapter(this, TypeToken.get(BabylonStakeExtra.class));
            final TypeAdapter<EigenLayerLstStakeExtra> adapterEigenLayerLstStakeExtra = gson.getDelegateAdapter(this, TypeToken.get(EigenLayerLstStakeExtra.class));
            final TypeAdapter<EigenLayerNativeStakeExtra> adapterEigenLayerNativeStakeExtra = gson.getDelegateAdapter(this, TypeToken.get(EigenLayerNativeStakeExtra.class));

            return (TypeAdapter<T>) new TypeAdapter<CreateStakeActivityExtra>() {
                @Override
                public void write(JsonWriter out, CreateStakeActivityExtra value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `BabylonStakeExtra`
                    if (value.getActualInstance() instanceof BabylonStakeExtra) {
                        JsonElement element = adapterBabylonStakeExtra.toJsonTree((BabylonStakeExtra)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `EigenLayerLstStakeExtra`
                    if (value.getActualInstance() instanceof EigenLayerLstStakeExtra) {
                        JsonElement element = adapterEigenLayerLstStakeExtra.toJsonTree((EigenLayerLstStakeExtra)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `EigenLayerNativeStakeExtra`
                    if (value.getActualInstance() instanceof EigenLayerNativeStakeExtra) {
                        JsonElement element = adapterEigenLayerNativeStakeExtra.toJsonTree((EigenLayerNativeStakeExtra)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: BabylonStakeExtra, EigenLayerLstStakeExtra, EigenLayerNativeStakeExtra");
                }

                @Override
                public CreateStakeActivityExtra read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    JsonObject jsonObject = jsonElement.getAsJsonObject();

                    // use discriminator value for faster oneOf lookup
                    CreateStakeActivityExtra newCreateStakeActivityExtra = new CreateStakeActivityExtra();
                    if (jsonObject.get("pool_type") == null) {
                        log.log(Level.WARNING, "Failed to lookup discriminator value for CreateStakeActivityExtra as `pool_type` was not found in the payload or the payload is empty.");
                    } else  {
                        // look up the discriminator value in the field `pool_type`
                        switch (jsonObject.get("pool_type").getAsString()) {
                            case "Babylon":
                                deserialized = adapterBabylonStakeExtra.fromJsonTree(jsonObject);
                                newCreateStakeActivityExtra.setActualInstance(deserialized);
                                return newCreateStakeActivityExtra;
                            case "EigenLayerLST":
                                deserialized = adapterEigenLayerNativeStakeExtra.fromJsonTree(jsonObject);
                                newCreateStakeActivityExtra.setActualInstance(deserialized);
                                return newCreateStakeActivityExtra;
                            case "EigenLayerNativeETH":
                                deserialized = adapterEigenLayerLstStakeExtra.fromJsonTree(jsonObject);
                                newCreateStakeActivityExtra.setActualInstance(deserialized);
                                return newCreateStakeActivityExtra;
                            case "BabylonStakeExtra":
                                deserialized = adapterBabylonStakeExtra.fromJsonTree(jsonObject);
                                newCreateStakeActivityExtra.setActualInstance(deserialized);
                                return newCreateStakeActivityExtra;
                            case "EigenLayerLstStakeExtra":
                                deserialized = adapterEigenLayerLstStakeExtra.fromJsonTree(jsonObject);
                                newCreateStakeActivityExtra.setActualInstance(deserialized);
                                return newCreateStakeActivityExtra;
                            case "EigenLayerNativeStakeExtra":
                                deserialized = adapterEigenLayerNativeStakeExtra.fromJsonTree(jsonObject);
                                newCreateStakeActivityExtra.setActualInstance(deserialized);
                                return newCreateStakeActivityExtra;
                            default:
                                log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for CreateStakeActivityExtra. Possible values: Babylon EigenLayerLST EigenLayerNativeETH BabylonStakeExtra EigenLayerLstStakeExtra EigenLayerNativeStakeExtra", jsonObject.get("pool_type").getAsString()));
                        }
                    }

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize BabylonStakeExtra
                    try {
                        // validate the JSON object to see if any exception is thrown
                        BabylonStakeExtra.validateJsonElement(jsonElement);
                        actualAdapter = adapterBabylonStakeExtra;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'BabylonStakeExtra'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for BabylonStakeExtra failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'BabylonStakeExtra'", e);
                    }
                    // deserialize EigenLayerLstStakeExtra
                    try {
                        // validate the JSON object to see if any exception is thrown
                        EigenLayerLstStakeExtra.validateJsonElement(jsonElement);
                        actualAdapter = adapterEigenLayerLstStakeExtra;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'EigenLayerLstStakeExtra'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for EigenLayerLstStakeExtra failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'EigenLayerLstStakeExtra'", e);
                    }
                    // deserialize EigenLayerNativeStakeExtra
                    try {
                        // validate the JSON object to see if any exception is thrown
                        EigenLayerNativeStakeExtra.validateJsonElement(jsonElement);
                        actualAdapter = adapterEigenLayerNativeStakeExtra;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'EigenLayerNativeStakeExtra'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for EigenLayerNativeStakeExtra failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'EigenLayerNativeStakeExtra'", e);
                    }

                    if (match == 1) {
                        CreateStakeActivityExtra ret = new CreateStakeActivityExtra();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CreateStakeActivityExtra: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CreateStakeActivityExtra() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateStakeActivityExtra(BabylonStakeExtra o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateStakeActivityExtra(EigenLayerLstStakeExtra o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateStakeActivityExtra(EigenLayerNativeStakeExtra o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("BabylonStakeExtra", BabylonStakeExtra.class);
        schemas.put("EigenLayerLstStakeExtra", EigenLayerLstStakeExtra.class);
        schemas.put("EigenLayerNativeStakeExtra", EigenLayerNativeStakeExtra.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CreateStakeActivityExtra.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * BabylonStakeExtra, EigenLayerLstStakeExtra, EigenLayerNativeStakeExtra
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof BabylonStakeExtra) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof EigenLayerLstStakeExtra) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof EigenLayerNativeStakeExtra) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be BabylonStakeExtra, EigenLayerLstStakeExtra, EigenLayerNativeStakeExtra");
    }

    /**
     * Get the actual instance, which can be the following:
     * BabylonStakeExtra, EigenLayerLstStakeExtra, EigenLayerNativeStakeExtra
     *
     * @return The actual instance (BabylonStakeExtra, EigenLayerLstStakeExtra, EigenLayerNativeStakeExtra)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `BabylonStakeExtra`. If the actual instance is not `BabylonStakeExtra`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BabylonStakeExtra`
     * @throws ClassCastException if the instance is not `BabylonStakeExtra`
     */
    public BabylonStakeExtra getBabylonStakeExtra() throws ClassCastException {
        return (BabylonStakeExtra)super.getActualInstance();
    }
    /**
     * Get the actual instance of `EigenLayerLstStakeExtra`. If the actual instance is not `EigenLayerLstStakeExtra`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EigenLayerLstStakeExtra`
     * @throws ClassCastException if the instance is not `EigenLayerLstStakeExtra`
     */
    public EigenLayerLstStakeExtra getEigenLayerLstStakeExtra() throws ClassCastException {
        return (EigenLayerLstStakeExtra)super.getActualInstance();
    }
    /**
     * Get the actual instance of `EigenLayerNativeStakeExtra`. If the actual instance is not `EigenLayerNativeStakeExtra`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EigenLayerNativeStakeExtra`
     * @throws ClassCastException if the instance is not `EigenLayerNativeStakeExtra`
     */
    public EigenLayerNativeStakeExtra getEigenLayerNativeStakeExtra() throws ClassCastException {
        return (EigenLayerNativeStakeExtra)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CreateStakeActivityExtra
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with BabylonStakeExtra
        try {
            BabylonStakeExtra.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for BabylonStakeExtra failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with EigenLayerLstStakeExtra
        try {
            EigenLayerLstStakeExtra.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for EigenLayerLstStakeExtra failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with EigenLayerNativeStakeExtra
        try {
            EigenLayerNativeStakeExtra.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for EigenLayerNativeStakeExtra failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for CreateStakeActivityExtra with oneOf schemas: BabylonStakeExtra, EigenLayerLstStakeExtra, EigenLayerNativeStakeExtra. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of CreateStakeActivityExtra given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateStakeActivityExtra
     * @throws IOException if the JSON string is invalid with respect to CreateStakeActivityExtra
     */
    public static CreateStakeActivityExtra fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateStakeActivityExtra.class);
    }

    /**
     * Convert an instance of CreateStakeActivityExtra to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
