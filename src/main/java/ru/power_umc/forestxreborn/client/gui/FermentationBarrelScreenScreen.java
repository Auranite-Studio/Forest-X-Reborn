package ru.power_umc.forestxreborn.client.gui;

import ru.power_umc.forestxreborn.world.inventory.FermentationBarrelScreenMenu;
import ru.power_umc.forestxreborn.procedures.FBProgress9Procedure;
import ru.power_umc.forestxreborn.procedures.FBProgress8Procedure;
import ru.power_umc.forestxreborn.procedures.FBProgress7Procedure;
import ru.power_umc.forestxreborn.procedures.FBProgress6Procedure;
import ru.power_umc.forestxreborn.procedures.FBProgress5Procedure;
import ru.power_umc.forestxreborn.procedures.FBProgress4Procedure;
import ru.power_umc.forestxreborn.procedures.FBProgress3Procedure;
import ru.power_umc.forestxreborn.procedures.FBProgress2Procedure;
import ru.power_umc.forestxreborn.procedures.FBProgress1Procedure;
import ru.power_umc.forestxreborn.procedures.FBProgress0Procedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class FermentationBarrelScreenScreen extends AbstractContainerScreen<FermentationBarrelScreenMenu> {
	private final static HashMap<String, Object> guistate = FermentationBarrelScreenMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public FermentationBarrelScreenScreen(FermentationBarrelScreenMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 210;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("forest:textures/screens/fermentation_barrel_screen.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		guiGraphics.blit(RenderType::guiTextured, texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("forest:textures/screens/fb_progress_bar_empty.png"), this.leftPos + 93, this.topPos + 41, 0, 0, 54, 10, 54, 10);

		if (FBProgress0Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("forest:textures/screens/fb_progress_bar_filled_0.png"), this.leftPos + 93, this.topPos + 41, 0, 0, 54, 10, 54, 10);
		}
		if (FBProgress1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("forest:textures/screens/fb_progress_bar_filled_1.png"), this.leftPos + 93, this.topPos + 41, 0, 0, 54, 10, 54, 10);
		}
		if (FBProgress2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("forest:textures/screens/fb_progress_bar_filled_2.png"), this.leftPos + 93, this.topPos + 41, 0, 0, 54, 10, 54, 10);
		}
		if (FBProgress3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("forest:textures/screens/fb_progress_bar_filled_3.png"), this.leftPos + 93, this.topPos + 41, 0, 0, 54, 10, 54, 10);
		}
		if (FBProgress4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("forest:textures/screens/fb_progress_bar_filled_4.png"), this.leftPos + 93, this.topPos + 41, 0, 0, 54, 10, 54, 10);
		}
		if (FBProgress5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("forest:textures/screens/fb_progress_bar_filled_5.png"), this.leftPos + 93, this.topPos + 41, 0, 0, 54, 10, 54, 10);
		}
		if (FBProgress6Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("forest:textures/screens/fb_progress_bar_filled_6.png"), this.leftPos + 93, this.topPos + 41, 0, 0, 54, 10, 54, 10);
		}
		if (FBProgress7Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("forest:textures/screens/fb_progress_bar_filled_7.png"), this.leftPos + 93, this.topPos + 41, 0, 0, 54, 10, 54, 10);
		}
		if (FBProgress8Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("forest:textures/screens/fb_progress_bar_filled_8.png"), this.leftPos + 93, this.topPos + 41, 0, 0, 54, 10, 54, 10);
		}
		if (FBProgress9Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("forest:textures/screens/fb_progress_bar_filled_9.png"), this.leftPos + 93, this.topPos + 41, 0, 0, 54, 10, 54, 10);
		}

		guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("forest:textures/screens/bottle_icon.png"), this.leftPos + 69, this.topPos + 35, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("forest:textures/screens/alcohol_ingridient_icon.png"), this.leftPos + 33, this.topPos + 35, 0, 0, 16, 16, 16, 16);

	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.forest.fermentation_barrel_screen.label_fermentation_barrel"), 59, 7, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
