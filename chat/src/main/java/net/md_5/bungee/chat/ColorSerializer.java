package net.md_5.bungee.chat;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.awt.Color;
import java.lang.reflect.Type;

public class ColorSerializer implements JsonSerializer<Color>, JsonDeserializer<Color>
{

    @Override
    public Color deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
    {
        return new Color( json.getAsInt() );
    }

    @Override
    public JsonElement serialize(Color src, Type typeOfSrc, JsonSerializationContext context)
    {
        return new JsonPrimitive( src.getRGB() & 0xffffff );
    }
}
