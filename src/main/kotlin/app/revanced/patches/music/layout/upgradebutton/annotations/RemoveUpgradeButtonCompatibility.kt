package app.revanced.patches.music.layout.upgradebutton.annotations

import app.revanced.patcher.annotation.Compatibility
import app.revanced.patcher.annotation.Package

@Compatibility(
    [Package(
        "com.google.android.apps.youtube.music", arrayOf("5.14.53", "5.16.51", "5.17.51", "5.21.52", "5.22.54")
    )]
)
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
internal annotation class RemoveUpgradeButtonCompatibility
