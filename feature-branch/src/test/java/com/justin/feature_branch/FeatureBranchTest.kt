package com.justin.feature_branch

import org.junit.Test

class FeatureBranchTest {

    @Test
    fun testBranch(){
        val actualData = FeatureBranch().printFeatureBranchValue()
        assert(actualData.equals("FeatureBranch changes") )
    }
}