package com.google.idea.sdkcompat.clion;

import com.intellij.execution.ExecutionException;
import com.intellij.openapi.util.ThrowableComputable;
import com.jetbrains.cidr.execution.CidrCoroutineHelper;
import com.jetbrains.cidr.execution.debugger.CidrDebugProcess;

// #api242
public class CidrDebugProcessCreator {
  public static CidrDebugProcess create(ThrowableComputable<CidrDebugProcess, ExecutionException> creator) throws ExecutionException {
    return CidrCoroutineHelper.runOnEDT(creator);
  }
}
