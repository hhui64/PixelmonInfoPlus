package io.github.hhui64.pixelmoninfoplus.command;

import io.github.hhui64.pixelmoninfoplus.PixelmonInfoPlus;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;

@SuppressWarnings("NullableProblems")
public class StatsPanelCommand extends CommandBase {

    /**
     * Gets the name of the command
     */
    @Override
    public String getName() {
        return "statspanel";
    }

    /**
     * Gets the usage string for the command.
     */
    @Override
    public String getUsage(ICommandSender sender) {
        return "";
    }

    /**
     * Callback for when the command is executed
     */
    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        EntityPlayerMP player = getCommandSenderAsPlayer(sender);
        player.openGui(PixelmonInfoPlus.instance, 1, player.getEntityWorld(), 0, 0, 0);
    }
}
