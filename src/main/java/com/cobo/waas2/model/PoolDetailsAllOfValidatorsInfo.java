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
import com.cobo.waas2.model.BabylonValidator;
import com.cobo.waas2.model.EigenlayerValidator;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



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
public class PoolDetailsAllOfValidatorsInfo extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(PoolDetailsAllOfValidatorsInfo.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PoolDetailsAllOfValidatorsInfo.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PoolDetailsAllOfValidatorsInfo' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<BabylonValidator> adapterBabylonValidator = gson.getDelegateAdapter(this, TypeToken.get(BabylonValidator.class));
            final TypeAdapter<EigenlayerValidator> adapterEigenlayerValidator = gson.getDelegateAdapter(this, TypeToken.get(EigenlayerValidator.class));

            return (TypeAdapter<T>) new TypeAdapter<PoolDetailsAllOfValidatorsInfo>() {
                @Override
                public void write(JsonWriter out, PoolDetailsAllOfValidatorsInfo value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `BabylonValidator`
                    if (value.getActualInstance() instanceof BabylonValidator) {
                        JsonElement element = adapterBabylonValidator.toJsonTree((BabylonValidator)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `EigenlayerValidator`
                    if (value.getActualInstance() instanceof EigenlayerValidator) {
                        JsonElement element = adapterEigenlayerValidator.toJsonTree((EigenlayerValidator)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: BabylonValidator, EigenlayerValidator");
                }

                @Override
                public PoolDetailsAllOfValidatorsInfo read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize BabylonValidator
                    try {
                        // validate the JSON object to see if any exception is thrown
                        BabylonValidator.validateJsonElement(jsonElement);
                        actualAdapter = adapterBabylonValidator;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'BabylonValidator'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for BabylonValidator failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'BabylonValidator'", e);
                    }
                    // deserialize EigenlayerValidator
                    try {
                        // validate the JSON object to see if any exception is thrown
                        EigenlayerValidator.validateJsonElement(jsonElement);
                        actualAdapter = adapterEigenlayerValidator;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'EigenlayerValidator'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for EigenlayerValidator failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'EigenlayerValidator'", e);
                    }

                    if (match == 1) {
                        PoolDetailsAllOfValidatorsInfo ret = new PoolDetailsAllOfValidatorsInfo();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for PoolDetailsAllOfValidatorsInfo: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public PoolDetailsAllOfValidatorsInfo() {
        super("oneOf", Boolean.FALSE);
    }

    public PoolDetailsAllOfValidatorsInfo(BabylonValidator o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PoolDetailsAllOfValidatorsInfo(EigenlayerValidator o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("BabylonValidator", BabylonValidator.class);
        schemas.put("EigenlayerValidator", EigenlayerValidator.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return PoolDetailsAllOfValidatorsInfo.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * BabylonValidator, EigenlayerValidator
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof BabylonValidator) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof EigenlayerValidator) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be BabylonValidator, EigenlayerValidator");
    }

    /**
     * Get the actual instance, which can be the following:
     * BabylonValidator, EigenlayerValidator
     *
     * @return The actual instance (BabylonValidator, EigenlayerValidator)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `BabylonValidator`. If the actual instance is not `BabylonValidator`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BabylonValidator`
     * @throws ClassCastException if the instance is not `BabylonValidator`
     */
    public BabylonValidator getBabylonValidator() throws ClassCastException {
        return (BabylonValidator)super.getActualInstance();
    }
    /**
     * Get the actual instance of `EigenlayerValidator`. If the actual instance is not `EigenlayerValidator`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EigenlayerValidator`
     * @throws ClassCastException if the instance is not `EigenlayerValidator`
     */
    public EigenlayerValidator getEigenlayerValidator() throws ClassCastException {
        return (EigenlayerValidator)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to PoolDetailsAllOfValidatorsInfo
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with BabylonValidator
        try {
            BabylonValidator.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for BabylonValidator failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with EigenlayerValidator
        try {
            EigenlayerValidator.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for EigenlayerValidator failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for PoolDetailsAllOfValidatorsInfo with oneOf schemas: BabylonValidator, EigenlayerValidator. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of PoolDetailsAllOfValidatorsInfo given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of PoolDetailsAllOfValidatorsInfo
     * @throws IOException if the JSON string is invalid with respect to PoolDetailsAllOfValidatorsInfo
     */
    public static PoolDetailsAllOfValidatorsInfo fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, PoolDetailsAllOfValidatorsInfo.class);
    }

    /**
     * Convert an instance of PoolDetailsAllOfValidatorsInfo to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
