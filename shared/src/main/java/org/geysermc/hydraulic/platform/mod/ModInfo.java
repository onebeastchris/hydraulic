package org.geysermc.hydraulic.platform.mod;

import org.jetbrains.annotations.NotNull;

import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Represents info about a mod.
 *
 * @param id the mod's ID
 * @param version the mod's version
 * @param name the mod's name
 * @param modPath the mod's path
 */
public record ModInfo(
        @NotNull String id,
        @NotNull String version,
        @NotNull String name,
        @NotNull Path[] modPath,
        @NotNull String iconPath
) {
    public Path resolve(String wantedPath) {
        // Find the first path that contains the wanted path
        for (Path path : modPath) {
            Path resolved = path.resolve(wantedPath);
            if (Files.exists(resolved)) {
                return resolved;
            }
        }

        // Fallback to the first path
        return modPath[0].resolve(wantedPath);
    }
}