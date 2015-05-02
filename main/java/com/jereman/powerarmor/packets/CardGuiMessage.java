package com.jereman.powerarmor.packets;

import scala.Console;

import com.jereman.powerarmor.IElementHandler;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class CardGuiMessage implements IMessage{
	public int buttonId;
	public CardGuiMessage(){}
	
	public CardGuiMessage(int buttonId){
		this.buttonId = buttonId;
		Console.println("Got the Button");
	}
	
	@Override
	public void fromBytes(ByteBuf buf) {
		int elementLength = buf.readInt();
		Console.println(elementLength);
		this.buttonId = elementLength;
		
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(buttonId);
		Console.println("Writing buttonID");
		
	}

		
	

}
