package utilities;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class EnumListUtil {

    //Return modifiable list
    public static <T extends Enum<T>> List<T> getEnumList(final Class<T> enumClass) {
        return new ArrayList<>(List.of(enumClass.getEnumConstants()));
    }
}