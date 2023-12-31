package com.flipperdevices.faphub.installedtab.impl.api

import androidx.compose.runtime.Composable
import com.flipperdevices.core.di.AppGraph
import com.flipperdevices.faphub.dao.api.model.FapItem
import com.flipperdevices.faphub.installation.api.FapInstallationUIApi
import com.flipperdevices.faphub.installedtab.api.FapInstalledApi
import com.flipperdevices.faphub.installedtab.impl.composable.ComposableInstalledTabScreen
import com.squareup.anvil.annotations.ContributesBinding
import javax.inject.Inject

@ContributesBinding(AppGraph::class, FapInstalledApi::class)
class FapInstalledApiImpl @Inject constructor(
    private val fapInstallationUIApi: FapInstallationUIApi
) : FapInstalledApi {
    @Composable
    override fun ComposableInstalledTab(onOpenFapItem: (FapItem) -> Unit) {
        ComposableInstalledTabScreen(
            onOpenFapItem = onOpenFapItem,
            installationButton = { fapItem, modifier, fontSize ->
                fapInstallationUIApi.ComposableButton(
                    fapItem = fapItem,
                    modifier = modifier,
                    textSize = fontSize
                )
            }
        )
    }
}
