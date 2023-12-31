package com.flipperdevices.nfceditor.sample

import android.app.Application
import com.flipperdevices.core.di.ApplicationParams
import com.flipperdevices.core.di.ComponentHolder
import com.flipperdevices.nfceditor.sample.di.DaggerAppComponent
import com.flipperdevices.nfceditor.sample.di.NfcEditorComponent
import tangle.inject.TangleGraph
import timber.log.Timber

class NfcEditorApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        val appComponent = DaggerAppComponent.factory()
            .create(
                context = this,
                application = this,
                ApplicationParams(
                    startApplicationClass = NfcEditorActivity::class,
                    version = "Sample"
                )
            )

        ComponentHolder.components += appComponent
        TangleGraph.add(appComponent)

        Timber.plant(Timber.DebugTree())
        val shake2report = ComponentHolder.component<NfcEditorComponent>().shake2report.get()
        shake2report.init()
    }
}
