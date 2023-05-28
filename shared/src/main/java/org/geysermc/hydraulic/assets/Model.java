package org.geysermc.hydraulic.assets;

import com.fasterxml.jackson.annotation.JsonProperty;
import net.minecraft.resources.ResourceLocation;

import java.util.List;
import java.util.Map;

public record Model(ResourceLocation parent, @JsonProperty("ambientocclusion") boolean ambientOcclusion, Map<String, ResourceLocation> textures, List<ModelOverride> overrides, Object[] elements, Object[] groups, Object display) {
}
