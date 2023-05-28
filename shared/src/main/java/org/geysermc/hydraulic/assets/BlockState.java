package org.geysermc.hydraulic.assets;

import java.util.List;
import java.util.Map;

public record BlockState(Map<String, Variant[]> variants, List<MultiPart> multipart) {
}
