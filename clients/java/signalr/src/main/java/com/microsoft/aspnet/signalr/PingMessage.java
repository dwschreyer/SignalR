// Copyright (c) .NET Foundation. All rights reserved.
// Licensed under the Apache License, Version 2.0. See License.txt in the project root for license information.

package com.microsoft.aspnet.signalr;

class PingMessage extends HubMessage
{
    private static PingMessage instance;

    private PingMessage()
    {
    }

    public static PingMessage getInstance(){
        if (instance == null) {
            instance = new PingMessage();
        }
        return instance;
    }

    @Override
    public HubMessageType getMessageType() {
        return HubMessageType.PING;
    }
}