package io.github.strikerrocker.vt.compat;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.InterModComms;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.SlotTypeMessage;

public class CuriosCompat {
    public static void sendImc() {
        InterModComms.sendTo("curios", SlotTypeMessage.REGISTER_TYPE, () -> new SlotTypeMessage.Builder("head").build());
    }

    public static boolean isStackInCuriosSlot(ItemStack stack) {
        return CuriosApi.getCuriosHelper().getCurio(stack).isPresent();
    }
}
