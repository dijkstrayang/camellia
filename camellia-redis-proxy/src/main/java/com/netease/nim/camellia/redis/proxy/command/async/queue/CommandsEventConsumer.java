package com.netease.nim.camellia.redis.proxy.command.async.queue;

/**
 *
 * Created by caojiajun on 2020/8/27
 */
public interface CommandsEventConsumer {

    void onEvent(CommandsEvent commandsEvent, boolean endOfBatch);
}
