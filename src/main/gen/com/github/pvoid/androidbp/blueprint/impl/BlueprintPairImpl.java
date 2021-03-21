/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

// This is a generated file. Not intended for manual editing.
package com.github.pvoid.androidbp.blueprint.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.pvoid.androidbp.blueprint.psi.*;
import com.github.pvoid.androidbp.blueprint.BlueprintPsiUtilsMirror;
import com.github.pvoid.androidbp.blueprint.completion.fields.BlueprintField;

public class BlueprintPairImpl extends ASTWrapperPsiElement implements BlueprintPair {

  public BlueprintPairImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BlueprintVisitor visitor) {
    visitor.visitPair(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BlueprintVisitor) accept((BlueprintVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public BlueprintFieldName getFieldName() {
    return findNotNullChildByClass(BlueprintFieldName.class);
  }

  @Override
  @NotNull
  public BlueprintValue getValue() {
    return findNotNullChildByClass(BlueprintValue.class);
  }

  @Override
  public BlueprintField getFieldDef() {
    return BlueprintPsiUtilsMirror.getFieldDef(this);
  }

}
