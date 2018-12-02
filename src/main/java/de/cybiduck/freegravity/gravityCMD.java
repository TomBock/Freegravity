package de.cybiduck.freegravity;

import lombok.AllArgsConstructor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

@AllArgsConstructor
public class gravityCMD implements CommandExecutor {

    private Freegravity freegravity;

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        return true;
    }
}
