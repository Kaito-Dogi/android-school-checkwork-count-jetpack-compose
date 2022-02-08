package app.doggy.checkworkcount_jetpackcompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var count by remember {
                mutableStateOf(0)
            }
//            // rememberSaveable：アクティビティまたはプロセスを再作成した後、UIの状態を復元できる。
//            var count by rememberSaveable {
//                mutableStateOf(0)
//            }
            Counter(count = count, onClick = { count += 1 })
        }
    }
}

@Composable
fun Counter(count: Int, onClick: () -> Unit) {
    val padding = 16.dp

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        // 修飾子関数は前の関数が返すModifierを変更するので、関数の順序は最終結果に影響を与える。
        // よって修飾子関数の順序は重要。
        modifier = Modifier
            .padding(padding)
            .fillMaxSize(),
    ) {
        Text(
            text = count.toString(),
            style = MaterialTheme.typography.h2,
            modifier = Modifier.padding(padding),
        )
        Button(
            onClick = onClick,
            modifier = Modifier.padding(padding),
        ) {
            Text(
                text = "PLUS",
            )
        }
    }
}

@Preview
@Composable
fun PreviewCounter() {
    Counter(count = 0, onClick = {})
}
