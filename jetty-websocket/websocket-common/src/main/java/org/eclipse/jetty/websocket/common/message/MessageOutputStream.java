//
//  ========================================================================
//  Copyright (c) 1995-2013 Mort Bay Consulting Pty. Ltd.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  and Apache License v2.0 which accompanies this distribution.
//
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  ========================================================================
//

package org.eclipse.jetty.websocket.common.message;

import java.io.IOException;
import java.io.OutputStream;

import org.eclipse.jetty.websocket.common.WebSocketSession;

public class MessageOutputStream extends OutputStream
{
    private final WebSocketSession session;
    private final int bufferSize;

    public MessageOutputStream(WebSocketSession session)
    {
        this.session = session;
        this.bufferSize = session.getPolicy().getMaxBinaryMessageBufferSize();
    }

    @Override
    public void close() throws IOException
    {
        // TODO finish sending whatever in the buffer with FIN=true
        // TODO or just send an empty buffer with FIN=true
        super.close();
    }

    @Override
    public void flush() throws IOException
    {
        // TODO flush whatever is in the buffer with FIN=false
        super.flush();
    }

    @Override
    public void write(int b) throws IOException
    {
        // TODO buffer up to limit, flush once buffer reached.
    }
}
