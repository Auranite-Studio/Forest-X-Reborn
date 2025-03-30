package ru.power_umc.forestxreborn.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

public class IfNightProcedure {
	public static boolean execute(LevelAccessor world) {
		return !(world instanceof Level _lvl0 && _lvl0.isBrightOutside());
	}
}
