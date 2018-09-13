// Copyright (c) .NET Foundation. All rights reserved.
// Licensed under the Apache License, Version 2.0. See License.txt in the project root for license information.

package com.microsoft.aspnet.signalr;

import java.util.concurrent.CompletableFuture;

class InvocationRequest {
    Class<?> returnType;
    CompletableFuture<Object> pendingCall = new CompletableFuture<>();

    InvocationRequest(Class<?> returnType) {
        this.returnType = returnType;
    }
}