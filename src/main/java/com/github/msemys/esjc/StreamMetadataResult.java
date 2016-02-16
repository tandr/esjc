package com.github.msemys.esjc;

import static com.github.msemys.esjc.util.Preconditions.checkArgument;
import static com.github.msemys.esjc.util.Strings.isNullOrEmpty;

public class StreamMetadataResult {
    public final String stream;
    public final boolean isStreamDeleted;
    public final int metastreamVersion;
    public final StreamMetadata streamMetadata;

    public StreamMetadataResult(String stream, boolean isStreamDeleted, int metastreamVersion, StreamMetadata streamMetadata) {
        checkArgument(!isNullOrEmpty(stream), "stream");
        this.stream = stream;
        this.isStreamDeleted = isStreamDeleted;
        this.metastreamVersion = metastreamVersion;
        this.streamMetadata = streamMetadata;
    }
}