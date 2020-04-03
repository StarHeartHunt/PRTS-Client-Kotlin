package wiki.prts.app.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import wiki.prts.app.fragment.SwipeRefreshWebViewFragment

class TabAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    val fragments = arrayOfNulls<SwipeRefreshWebViewFragment>(4)
    override fun getItemCount(): Int = 4
    override fun createFragment(position: Int): Fragment {
        val f = SwipeRefreshWebViewFragment()
        fragments[position] = f
        return f
    }
}