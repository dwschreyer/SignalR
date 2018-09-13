// Copyright (c) .NET Foundation. All rights reserved.
// Licensed under the Apache License, Version 2.0. See License.txt in the project root for license information.

package com.microsoft.aspnet.signalr;

class CompletionMessage extends HubMessage {
    int type = HubMessageType.COMPLETION.value;
    String invocationId;
    Object result;
    String error;

    public CompletionMessage(String invocationId, Object result, String error) {
        if (error != null && result != null)
        {
            throw new IllegalArgumentException("Expected either 'error' or 'result' to be provided, but not both");
        }
        this.invocationId = invocationId;
        this.result = result;
        this.error = error;
    }

    public Object getResult() {
        return result;
    }

    public String getError() {
        return error;
    }

    @Override
    public HubMessageType getMessageType() {
        return HubMessageType.COMPLETION;
    }
}