package dev.amethystmc.Core.Commands;

import dev.amethystmc.Core.Interfaces.Interfaces;
import dev.amethystmc.Core.Utils.CommandUtil;
import dev.amethystmc.Core.Utils.MessageUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Ben on 9/27/2016.
 */
public class DebugCommand extends CommandUtil
{

    public DebugCommand(String command, String usage, String description)
    {
        super(command, usage, description);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {

        if (cmd.getName().equalsIgnoreCase("debug"))
        {

            Player p = (Player) sender;
            Interfaces.getHatInterface().open(p);
            MessageUtil.sendDeveloperMessage(p, "&eNow Debugging!");

        }

        return true;

    }

}

