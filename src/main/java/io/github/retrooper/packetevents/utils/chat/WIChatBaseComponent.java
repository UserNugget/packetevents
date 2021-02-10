package io.github.retrooper.packetevents.utils.chat;

import java.util.List;

// todo: WChatComponentKeybind WChatComponentScore WChatComponentSelector WChatMessage
// todo: Rename everything to make sense
// todo: ChatSerializer
public interface WIChatBaseComponent extends Iterable<WIChatBaseComponent> {
    WIChatBaseComponent setChatModifier(WChatModifier var1);

    WChatModifier getChatModifier();

    WIChatBaseComponent a(String var1);

    WIChatBaseComponent addSibling(WIChatBaseComponent var1);

    String getText();

    String toPlainText();

    List<WIChatBaseComponent> a();

    WIChatBaseComponent f();
}
