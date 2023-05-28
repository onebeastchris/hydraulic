package org.geysermc.hydraulic;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Constants {
    public static final String MOD_ID = "hydraulic";
    public static final String MOD_NAME = "Hydraulic";
    public static final String VERSION = "1.0.0-SNAPSHOT";

    public static final ObjectMapper MAPPER = new ObjectMapper().enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

    public static final String JAVA_TEXTURE_LOCATION = "assets/%s/textures/%s.png";
    public static final String JAVA_ITEM_MODEL_LOCATION = "assets/%s/models/item/%s.json";

    public static final String BEDROCK_ITEM_TEXTURE_LOCATION = "textures/items/%s/%s.png";
}
