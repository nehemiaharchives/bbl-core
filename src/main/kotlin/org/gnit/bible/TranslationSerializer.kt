package org.gnit.bible

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

object TranslationSerializer: KSerializer<Translation> {

    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("Translation", PrimitiveKind.STRING)

    override fun serialize(encoder: Encoder, value: Translation) {
        encoder.encodeString(value.name)
    }

    override fun deserialize(decoder: Decoder): Translation {
        val value = decoder.decodeString()
        return Translation.valueOf(value)
    }
}