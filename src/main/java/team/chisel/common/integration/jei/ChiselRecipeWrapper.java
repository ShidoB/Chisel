package team.chisel.common.integration.jei;

import java.util.Collections;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import team.chisel.api.carving.ICarvingGroup;
import team.chisel.api.carving.ICarvingVariation;

import com.google.common.collect.Lists;

@ParametersAreNonnullByDefault
public class ChiselRecipeWrapper implements IRecipeWrapper {

    private ICarvingGroup group;

    public ChiselRecipeWrapper(ICarvingGroup group){
        this.group = group;
    }

    @Override
    public List<ItemStack> getInputs(){
        List<ItemStack> inputStack = Lists.newArrayList();
        for (ICarvingVariation variation : this.group.getVariations()){
            inputStack.add(variation.getStack());
        }
        return inputStack;
    }

    @Override
    public List<ItemStack> getOutputs(){
        List<ItemStack> outputStack = Lists.newArrayList();
        for (ICarvingVariation variation : this.group.getVariations()){
            outputStack.add(variation.getStack());
        }
        return outputStack;
    }

    @Override
    public List<FluidStack> getFluidInputs(){
        return Collections.emptyList();
    }

    @Override
    public List<FluidStack> getFluidOutputs(){
        return Collections.emptyList();
    }

    @Override
    public void drawInfo(Minecraft minecraft, int recipeWidth, int recipeHeight, int mouseX, int mouseY) {
    }

    @Override
    public void drawAnimations(@Nonnull Minecraft minecraft, int recipeWidth, int recipeHeight){
    }

    @Override
    public List<String> getTooltipStrings(int mouseX, int mouseY){
        return Collections.emptyList();
    }

    @Override
    public boolean handleClick(Minecraft minecraft, int mouseX, int mouseY, int mouseButton) {
        return false;
    }

    @Override
    public void getIngredients(IIngredients ingredients) {
    }
}
