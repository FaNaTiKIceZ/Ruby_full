package net.mcreator.slot.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.slot.world.inventory.SPELLTREEGUIMenu;
import net.mcreator.slot.network.SPELLTREEGUIButtonMessage;
import net.mcreator.slot.SlotMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class SPELLTREEGUIScreen extends AbstractContainerScreen<SPELLTREEGUIMenu> {
	private final static HashMap<String, Object> guistate = SPELLTREEGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_scar_warrior;
	Button button_antiscar;

	public SPELLTREEGUIScreen(SPELLTREEGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 190;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("slot:textures/screens/spelltreegui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("slot:textures/screens/scar_warrior.png"));
		this.blit(ms, this.leftPos + 129, this.topPos + 4, 0, 0, 32, 32, 32, 32);

		RenderSystem.setShaderTexture(0, new ResourceLocation("slot:textures/screens/anti_scar.png"));
		this.blit(ms, this.leftPos + 17, this.topPos + -17, 0, 0, 64, 64, 64, 64);

		RenderSystem.disableBlend();
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
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		button_scar_warrior = new Button(this.leftPos + 113, this.topPos + 41, 63, 20, Component.translatable("gui.slot.spelltreegui.button_scar_warrior"), e -> {
			if (true) {
				SlotMod.PACKET_HANDLER.sendToServer(new SPELLTREEGUIButtonMessage(0, x, y, z));
				SPELLTREEGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_scar_warrior", button_scar_warrior);
		this.addRenderableWidget(button_scar_warrior);
		button_antiscar = new Button(this.leftPos + 14, this.topPos + 41, 51, 20, Component.translatable("gui.slot.spelltreegui.button_antiscar"), e -> {
			if (true) {
				SlotMod.PACKET_HANDLER.sendToServer(new SPELLTREEGUIButtonMessage(1, x, y, z));
				SPELLTREEGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_antiscar", button_antiscar);
		this.addRenderableWidget(button_antiscar);
	}
}
