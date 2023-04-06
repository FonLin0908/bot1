package com.bowchan;

import com.bowchan.listenner.Listenner1;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.sharding.ShardManager;

import javax.security.auth.login.LoginException;

public class Main {
    private  final ShardManager shardManager;

    public  Main(){

        String token = "MTA5MDY2OTc0NjAzMjIzNDUzNg.GxbKr1.yYC_LqiLHtXxFEbo7-PA2d5dOsxzThAEyH89JY";
        DefaultShardManagerBuilder builder = DefaultShardManagerBuilder.createDefault(token);
        builder.setStatus(OnlineStatus.ONLINE);
        builder.setActivity(Activity.playing("開盲盒"));
        builder.enableIntents(GatewayIntent.GUILD_MESSAGES, GatewayIntent.DIRECT_MESSAGES, GatewayIntent.MESSAGE_CONTENT);

        shardManager = builder.build();

        shardManager.addEventListener(new Listenner1());
    }

    public  ShardManager getShardManager(){
        return shardManager;
    }

    public static void main(String[] args) {

        Main main = new Main();
    }
}
