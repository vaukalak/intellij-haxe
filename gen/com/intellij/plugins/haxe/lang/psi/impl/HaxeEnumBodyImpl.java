// This is a generated file. Not intended for manual editing.
package com.intellij.plugins.haxe.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.plugins.haxe.lang.lexer.HaxeTokenTypes.*;
import com.intellij.plugins.haxe.lang.psi.*;

public class HaxeEnumBodyImpl extends HaxePsiCompositeElementImpl implements HaxeEnumBody {

  public HaxeEnumBodyImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<HaxeEnumValueDeclaration> getEnumValueDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaxeEnumValueDeclaration.class);
  }

  @Override
  @NotNull
  public List<HaxePp> getPpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaxePp.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HaxeVisitor) ((HaxeVisitor)visitor).visitEnumBody(this);
    else super.accept(visitor);
  }

}
