package org.geysermc.hydraulic.assets;

import java.util.Map;

public record MultiPart(Variant apply, Map<String, String> when) {
}
